package com.clean.code.exceptions;


import java.util.logging.Level;
import java.util.logging.Logger;

public class DeletePageService {


    private static final int E_OK = 1;
    private static final int E_ERROR = 2;
    private Repository repository;
    private Registry registry;
    private Config config;
    private Logger logger;

    void deletePageWithConfigAndReference(Page page) {
        try {
            delete(page);
            logSuccess();
        } catch (PageEmptyException exception) {
            logError(exception);
        }

    }

    private void delete(Page page) {
        repository.deletePage(page);
        registry.deleteReference(page);
        config.deleteKey(page);
    }

    private void logError(Exception e) {
        logger.log(Level.WARNING, e.getMessage());
    }

    private void logSuccess() {
        logger.log(Level.INFO, "page deleted");
    }


    class Page {
    }

    class Registry {

        public int deleteReference(Page page) {
            if (page != null) {
                return E_OK;
            } else {
                return E_ERROR;
            }
        }
    }

    class Config {

        public int deleteKey(Page page) {
            if (page != null) {
                return E_OK;
            } else {
                return E_ERROR;
            }
        }
    }

    int deletePage(Page page) {
        if (page != null) {
            return E_OK;
        } else {
            return E_ERROR;
        }

    }


    private class Repository {
        public void deletePage(Page page) {
            if (page == null) {
                throw new PageEmptyException("page is null");
            }
            //rest of stuff
        }
    }

    private class PageEmptyException extends RuntimeException {
        public PageEmptyException(String messgae) {
            super(messgae);
        }
    }
}
