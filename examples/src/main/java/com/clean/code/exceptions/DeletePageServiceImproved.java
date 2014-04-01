package com.clean.code.exceptions;


import java.util.logging.Level;
import java.util.logging.Logger;

public class DeletePageServiceImproved {

    private Repository repository;
    private Registry registry;
    private Config config;
    private Logger logger;

    void deletePageWithConfigAndReference(Page page) {
        try {
            repository.deletePage(page);
            registry.deleteReference(page);
            config.deleteKey(page);
        } catch (Exception e) {
            logger.log(Level.WARNING, e.getMessage());
        }

    }














    class Page {

    }

    class Registry {


        public int deleteReference(Page page) {
            return 0;
        }
    }

    class Config {


        public int deleteKey(Page page) {
            return 0;
        }
    }

    private class Repository {
        public int deletePage(Page page) {
            return 0;
        }
    }
}
