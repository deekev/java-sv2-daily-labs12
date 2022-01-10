package day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class RunningFileManager {

    private List<Run> running = new ArrayList<>();

    public double getKmsPerMonth(int year, Month month) {
        double sum = 0;
        for (Run actual: running) {
            if (actual.getDate().getYear() == year && actual.getDate().getMonth() == month) {
                sum += actual.getKm();
            }
        }
        return sum;
    }

    public void readLines(Path path) {
        try (BufferedReader br = Files.newBufferedReader(path)) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                Run run = createRunFromLine(line);
                running.add(run);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can't reach file.", ioe);
        }
    }

    private Run createRunFromLine(String line) {
        String[] temp = line.split(" km;");
        return new Run(Double.parseDouble(temp[0]), LocalDate.parse(temp[1]));
    }
}
