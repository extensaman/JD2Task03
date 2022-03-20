package by.academy.it.task03.utility.filework;

import java.util.Collection;

public interface FileWorker<T, R> {
    Collection<T> readRequest() throws FileWorkerException;

    void writeResponse(Collection<R> responses) throws FileWorkerException;
}
