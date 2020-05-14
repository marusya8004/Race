package reader.impl;

import base.BaseReader;
import exception.UnableToReadException;
import interfaces.Reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class StreamTextFileReader extends BaseReader implements Reader {

    public StreamTextFileReader(File file) {
        super(file);
    }

    public StreamTextFileReader(String path) {
        super(path);
    }

    @Override
    public String read() throws UnableToReadException{
        try(FileInputStream fin = new FileInputStream(this.file)) { // try withou resources
            byte[] buffer = new byte[fin.available()];
            fin.read(buffer, 0, buffer.length);
            //return Arrays.toString(buffer); wtf???
            return new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new UnableToReadException(String.format("Could not read %s!", this.path));
    }

}
