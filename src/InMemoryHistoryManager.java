import java.util.LinkedList;
import java.util.List;

public class InMemoryHistoryManager implements HistoryManager {
    private final static int SIZE_OF_HISTORY_LIST = 10;
    List<Task> historyList;

    public InMemoryHistoryManager(){
        historyList = new LinkedList<>();
    }

    @Override
    public List<Task> getHistory() {
        for (Task t : historyList) {
            System.out.println(t.nameTask);
        }
        return historyList;
    }

    @Override
    public void add(Task task) {
        if (historyList.size() == SIZE_OF_HISTORY_LIST) {
            historyList.remove(0);
        }
        historyList.add(task);
    }

}