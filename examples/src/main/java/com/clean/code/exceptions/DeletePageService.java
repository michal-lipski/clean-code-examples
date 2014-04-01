package com.clean.code.exceptions;


import java.util.logging.Level;
import java.util.logging.Logger;

public class DeletePageService {


    private static final int E_OK = 1;
    private static final int E_ERROR = 2;
    private Registry registry;
    private Config config;
    private Logger logger;

    void deletePageWithConfigAndReference(Page page) {
        if (deletePage(page) == E_OK) {
            if (registry.deleteReference(page) == E_OK) {
                if (config.deleteKey(page) == E_OK) {
                    logger.log(Level.INFO, "page deleted");
                } else {
                    logger.log(Level.INFO, "configKey not deleted");
                }
            } else {
                logger.log(Level.INFO, "deleteReference from registry failed");
            }
        } else {
            logger.log(Level.WARNING, "delete failed");
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

    int deletePage(Page page) {
        return 0;
    }


}
