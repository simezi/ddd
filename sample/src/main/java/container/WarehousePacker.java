package container;

import java.util.Collection;

/**
 * Created by matsubaray on 2016/09/13.
 */
public interface WarehousePacker {
    public void pack(Collection<Container> containersToFill,Collection<Drum> drumsToPack) throws NoAnswerFoundException;


}
