package section9.container;

/**
 * Created by matsubaray on 2016/09/13.
 */
public class Drum {

    private ContainerSpecification spec;

    public double getSize(){
        return 0.1;
    }

    public void setContainerSpecification(ContainerSpecification spec){
        this.spec = spec;
    }

    public ContainerSpecification getContainerSpecification() {
        return spec;
    }
}
