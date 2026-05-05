package _19_NestedClass;

// User클래스에 빌더패턴을 적용시키기
public class User {
    private String username;
    private String password;

    private User(Builder builder) {
        this.username = builder().username;
        this.password = builder().password;
    }

    public static Builder builder() {
        return new Builder();
    }

    private static class Builder {
        private String username;
        private String password;

        public Builder username(String username){
            this.username = username;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }
    }

    public User build() {
        User u = new User(this);
        return u;
    }
}
