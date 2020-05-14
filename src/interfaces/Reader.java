package interfaces;

import exception.UnableToCloseExcepton;
import exception.UnableToReadException;

public interface Reader {
    String read() throws UnableToReadException, UnableToCloseExcepton;
}
