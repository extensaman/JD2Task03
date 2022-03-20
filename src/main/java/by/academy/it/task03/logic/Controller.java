package by.academy.it.task03.logic;

import by.academy.it.task03.entity.CalculatedTime;
import by.academy.it.task03.entity.EstimationRequest;
import by.academy.it.task03.entity.EstimationResponse;
import by.academy.it.task03.utility.filework.FileWorker;
import by.academy.it.task03.utility.filework.FileWorkerException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static by.academy.it.task03.App.BASE_TIME;

public class Controller {
    private static final Logger logger = LogManager.getLogger(Controller.class);
    private final FileWorker<EstimationRequest, EstimationResponse> fileWorker;

    public Controller(FileWorker<EstimationRequest, EstimationResponse> fileWorker) {
        this.fileWorker = fileWorker;
    }

    public void execute() {
        Collection<EstimationRequest> requests = null;

        try {
            requests = fileWorker.readRequest();
        } catch (FileWorkerException e) {
            logger.error(e);
            return;
        }

        List<EstimationResponse> responses = requests.stream()
                .map(this::handleEstimationRequest)
                .collect(Collectors.toList());

        try {
            fileWorker.writeResponse(responses);
        } catch (FileWorkerException e) {
            logger.error(e);
        }
    }

    private EstimationResponse handleEstimationRequest(EstimationRequest request) {
        Estimator estimator = EstimatorCreator.getInstance().create(request.getStudentType());
        CalculatedTime calculatedTime = estimator.doEstimate(request.getStudent(), BASE_TIME);
        double fullTime = calculatedTime.getPracticeTime() +
                calculatedTime.getSearchTime() +
                calculatedTime.getStudyTime();
        return new EstimationResponse(request.getStudent(), request.getStudentType(), calculatedTime, fullTime);
    }
}
