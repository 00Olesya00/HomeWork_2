module Lesson_5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens Lesson_5 to javafx.fxml;
    exports Lesson_5;
}