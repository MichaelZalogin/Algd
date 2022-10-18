package javaExerсise.lambda;

import java.util.List;
import java.util.Optional;

public class OptionalOrElseThrow {
    public static class User {

        private String login;

        public User(String login) {
            this.login = login;
        }

        public String getLogin() {
            return login;
        }
    }

    public static class UserNotFoundException extends RuntimeException {
    }

    public static User orElseThrow(List<User> list, String login) {
        Optional<User> optionalUser = search(list, login);
        optionalUser.orElseThrow(UserNotFoundException::new);
        return optionalUser.get();
    }

    private static Optional<User> search(List<User> list, String login) {
        Optional<User> optionalUser = Optional.empty();
        for (var user : list) {
            if (login.equals(user.login)) {
                optionalUser = Optional.of(user);
            }
        }
        return optionalUser;
    }
}
