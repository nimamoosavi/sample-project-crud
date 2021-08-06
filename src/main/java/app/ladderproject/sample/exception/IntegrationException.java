package app.ladderproject.sample.exception;

import app.ladderproject.core.utility.view.Message;
import lombok.Getter;

@Getter
public enum IntegrationException implements Message {
    USERNAME_NOT_FOUND {
        @Override
        public String key() {
            return this.name();
        }
    },
    USERNAME_EXISTED {
        @Override
        public String key() {
            return this.name();
        }
    }
}
