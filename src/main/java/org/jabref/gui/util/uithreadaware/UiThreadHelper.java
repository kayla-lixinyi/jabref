package org.jabref.gui.util.uithreadaware;

import javafx.application.Platform;

public class UiThreadHelper {

    static void ensureUiThreadExecution(Runnable task) {
        if (Platform.isFxApplicationThread()) {
            task.run();
        } else {
            Platform.runLater(task);
        }
    }
}
