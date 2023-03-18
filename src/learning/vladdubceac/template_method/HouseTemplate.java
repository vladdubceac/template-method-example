package learning.vladdubceac.template_method;

public abstract class HouseTemplate {

    // template method, final so subclasses cannot override it
    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is build");
    }

    // default implementation, hook method
    private void buildWindows() {
        System.out.println("Building glass windows");
    }

    // methods to be implemented by subclasses
    public abstract void buildWalls();

    public abstract void buildPillars();

    private void buildFoundation(){
        System.out.println("Building foundation with cement, iron rods and sand");
    };
}
