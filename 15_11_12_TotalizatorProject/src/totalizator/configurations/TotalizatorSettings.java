package totalizator.configurations;

import java.io.BufferedReader;
import java.io.FileReader;

public class TotalizatorSettings {

    private static final String FILE_NAME = "totalizator.properties";

    private static String userClassName = null;
    private static String horseraceClassName = null;
    private static String betClassName = null;

    static {
        try {
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
            String str = null;
            while ((str = br.readLine()) != null) {
                if (!str.trim().isEmpty()) {
                    String[] in = str.split("=");
                    if (in.length == 2 && in[0].equals("user.class.name")) {
                        userClassName = in[1];
                    }
                    if (in.length == 2 && in[0].equals("horserace.class.name")) {
                        horseraceClassName = in[1];
                    }
                    if (in.length == 2 && in[0].equals("bet.class.name")) {
                        betClassName = in[1];
                    }
                }
            }
            br.close();
        } catch (Exception ex) {
        }
    }

    public static String getUserDAOClassName() {
        return userClassName;
    }

    public static String getHorseraceDOAClassName() {
        return horseraceClassName;
    }

    public static String getBetDAOClassName() {
        return betClassName;
    }
}
