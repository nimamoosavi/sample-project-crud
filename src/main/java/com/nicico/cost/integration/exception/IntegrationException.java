package com.nicico.cost.integration.exception;

import com.nicico.cost.framework.utility.view.Message;
import lombok.Getter;

@Getter
public enum IntegrationException implements Message {
    DETAIL_TYPE_NOT_FOUND {
        @Override
        public String key() {
            return this.name();
        }
    },
    DETAIL_NOT_FOUND {
        @Override
        public String key() {
            return this.name();
        }
    },
    NIMA {
        @Override
        public String key() {
            return this.name();
        }
    }
}
