package section9.container;

import java.util.Collection;

/**
 * Created by matsubaray on 2016/09/13.
 */
public class PrototypePacker implements WarehousePacker {

    @Override
    public void pack(Collection<Container> containersToFill, Collection<Drum> drumsToPack) throws NoAnswerFoundException {
        drumsToPack.stream()
                .forEach(drum -> {
                    try {
                        findContainerFor(containersToFill, drum).add(drum);
                    } catch (NoAnswerFoundException e) {

                    }
                });
    }

    public Container findContainerFor(Collection<Container> containers,Drum drum) throws NoAnswerFoundException{
        return containers.stream()
                .filter(container -> container.canAccommodate(drum))
                .findAny()
                .orElseThrow(() -> new NoAnswerFoundException());
    }
}
