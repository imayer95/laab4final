

import ui.LaboratoriesUI;

public class App {

    public static void main(String[] args) {
    	LaboratoriesUI view  = new LaboratoriesUI();

        try {
            view.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}