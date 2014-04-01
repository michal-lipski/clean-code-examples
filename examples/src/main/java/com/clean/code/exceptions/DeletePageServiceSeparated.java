package com.clean.code.exceptions;


import java.util.logging.Level;
import java.util.logging.Logger;

public class DeletePageServiceSeparated {

    private Repository repository;
    private Registry registry;
    private Config config;
    private Logger logger;


    public void delete(Page page) {
        try {
            deletePageAndAllReferences(page);
        } catch (Exception e) {
            logError(e);
        }
    }

    private void deletePageAndAllReferences(Page page) throws Exception {
        repository.deletePage(page);
        registry.deleteReference(page);
        config.deleteKey(page);
    }

    private void logError(Exception e) {
        logger.log(Level.WARNING, e.getMessage());
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
