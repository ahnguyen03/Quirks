package cmput301f17t12.quirks.Interfaces;

import cmput301f17t12.quirks.Models.Drop;
import cmput301f17t12.quirks.Models.User;

/**
 * Created by thomas on 2017-10-21.
 */

public interface Tradable {
    public boolean trade(User user, Drop drop);
}
