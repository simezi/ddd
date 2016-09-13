package section9.container;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by matsubaray on 2016/09/13.
 */
public class Container {

    private double capacity;

    private Set<Drum> drums = new HashSet<>(); // 書籍では変数名がcontainers　になっている。これを簡便のためにdrumsにしてはマズイのだろうか？

    private Set<ContainerFeature> features = new HashSet<>();

    public boolean hasSpaceFor(Drum aDrum){
        return remainingSpace() >= aDrum.getSize();
    }

    private double remainingSpace() {
        return capacity - drums.stream().mapToDouble(drum -> drum.getSize()).sum();
    }

    boolean isSafelyPacked() {
        return drums.stream()
                .filter(drum -> !drum.getContainerSpecification().isSatisfiedBy(this))
                .findAny()
                .isPresent();
    }

    public boolean canAccommodate(Drum aDrum){
        return hasSpaceFor(aDrum) && aDrum.getContainerSpecification().isSatisfiedBy(this);
    }

    public Set<ContainerFeature> getFeatures() {
        return this.features;
    }

    public void add(Drum drum) {
        this.drums.add(drum);
    }
}
