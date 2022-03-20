package by.academy.it.task03.utility.filework;

public class FileWorkerException extends Exception{
    public FileWorkerException() {
        super();
    }

    public FileWorkerException(String message) {
        super(message);
    }

    public FileWorkerException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileWorkerException(Throwable cause) {
        super(cause);
    }
}
