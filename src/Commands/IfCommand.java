package Commands;

import java.util.List;

public class IfCommand implements INTConditionalCommand {
    private List<INTCommand> positiveCommands;
    private List<INTCommand> negativeCommands;
}