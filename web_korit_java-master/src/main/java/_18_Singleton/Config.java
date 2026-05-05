package _18_Singleton;

// Config 클래스에 싱글톤패턴을 적용시키기
public class Config {
    private String apiKey;
    private String hostAddress;
    private String mode;

    // 상수
    public static final String DEV_MODE = "DEV";
    public static final String PRODUCTION_MODE = "PRODUCTION";

    // eager loading -> 운영 시 용이
    private static Config instance;

    private Config() {
        this.apiKey = "My_Key";
        this.hostAddress = "127.0.0.1";
        this.mode = DEV_MODE;
    }

    public static Config getInstance() {
        // 지연로등 (lazy Loading) -> 업데이트 시 용아
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getMode() {
        return mode;
    }
}

