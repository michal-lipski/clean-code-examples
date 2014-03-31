package com.clean.code.functions;

public class BooleanArguments {

    class User {
        private String name;
        private String title;
        private boolean supperUser;

        public void setSupperUser(boolean status) {
            supperUser = status;
        }

        public boolean isSupperUser() {
            return supperUser;
        }
    }

    public void createNormalUser() {
        User user = new User();

        user.setSupperUser(false);
    }

    public void executeWithSuperUser() {
        User user = new User();

        if (user.isSupperUser()) {
            //execute some important stuff
        }
    }

    public void executeWithNormalUser() {
        User user = new User();

        if (!user.isSupperUser()) {
            //execute some normal stuff
        }
    }


}
