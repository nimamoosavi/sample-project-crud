package app.ladderproject.integration.exception;

import com.webold.framework.utility.view.Message;
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
    ALREADY_EXISTED {
        @Override
        public String key() {
            return this.name();
        }
    },
    EXCEL_TEMPLATE_ERROR {
        @Override
        public String key() {
            return this.name();
        }
    }
}
