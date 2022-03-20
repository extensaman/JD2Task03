package by.academy.it.task03.utility.filework;

import by.academy.it.task03.entity.EstimationRequest;
import by.academy.it.task03.entity.EstimationResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class JSONFileWorker implements FileWorker<EstimationRequest, EstimationResponse> {

    private static final Logger logger = LogManager.getLogger(JSONFileWorker.class);
    private final ObjectMapper mapper;
    private final File requestFile;
    private final File responseFile;

    public JSONFileWorker(ObjectMapper mapper, String requestFilePath, String responseFilePath) {
        this.mapper = mapper;
        this.requestFile = new File(requestFilePath);
        this.responseFile = new File(responseFilePath);
    }

    public JSONFileWorker(String requestFilePath, String responseFilePath) {
        this.requestFile = new File(requestFilePath);
        this.responseFile = new File(responseFilePath);
        this.mapper = new ObjectMapper();
    }

    @Override
    public void writeResponse(Collection<EstimationResponse> responses) throws FileWorkerException {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(responseFile))) {
            for (EstimationResponse response : responses) {
                String JSONString = mapper.writeValueAsString(response);
                bufferedWriter.write(JSONString);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            throw new FileWorkerException(e);
        }
        logger.debug(logger.getName() + ": Responses collection has been written");
    }

    @Override
    public Collection<EstimationRequest> readRequest() throws FileWorkerException {
        Collection<EstimationRequest> requests = new ArrayList<>();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(requestFile))) {
            while(bufferedReader.ready()) {
                requests.add(mapper.readValue(bufferedReader.readLine(), EstimationRequest.class));
            }
        } catch (IOException e) {
            throw new FileWorkerException(e);
        }
        logger.debug(logger.getName() + ": Requests collection has been read");
        return requests;
    }
}
