import View.View;
import Model.MainModel;
import Controller.MainController;


public class Driver {
    public static void main(String[] args) {
        // added comment
        MainModel model = new MainModel();
        View view = new View();
        MainController controller = new MainController(model,view);
        controller.startGame(true);

    }
}
