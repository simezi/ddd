package section9.container;

/**
 * Created by matsubaray on 2016/09/13.
 */
public class ContainerSpecification {

    private ContainerFeature requiredFeature;

    public ContainerSpecification(ContainerFeature required){
        requiredFeature = required;
    }

    boolean isSatisfiedBy(Container aContainer){
        return aContainer.getFeatures().contains(requiredFeature);
    }


}
