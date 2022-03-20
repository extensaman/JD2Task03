package by.academy.it.task03.utility;

import by.academy.it.task03.entity.EstimationRequest;
import by.academy.it.task03.entity.Student;
import by.academy.it.task03.entity.StudentType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

public class RequestGenerator {

    private static final Logger logger = LogManager.getLogger(RequestGenerator.class);

    private RequestGenerator() {
    }

    public static void generateToFile(String filePath) {
        Collection<EstimationRequest> requests = List.of(
                new EstimationRequest(new Student("01"), StudentType.TYPE01),
                new EstimationRequest(new Student("02"), StudentType.TYPE02),
                new EstimationRequest(new Student("03"), StudentType.TYPE03),
                new EstimationRequest(new Student("04"), StudentType.TYPE01),
                new EstimationRequest(new Student("05"), StudentType.TYPE02),
                new EstimationRequest(new Student("06"), StudentType.TYPE03),
                new EstimationRequest(new Student("07"), StudentType.TYPE01),
                new EstimationRequest(new Student("08"), StudentType.TYPE02),
                new EstimationRequest(new Student("09"), StudentType.TYPE03));

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(filePath)))) {
            ObjectMapper mapper = new ObjectMapper();
            for (EstimationRequest response : requests) {
                String JSONString = mapper.writeValueAsString(response);
                bufferedWriter.write(JSONString);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            logger.error(e);
        }
        logger.debug(logger.getName() + ": Hardcoded requests have been written to file");
    }
}
