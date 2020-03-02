import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DailyPlanner {
    DailyTasks tasks;
    Days day;
    Map<Days,List<String>>  scheduleForWeek = new HashMap<>();

    public void addSchedule(DailyTasks task){

        List<String> tasks = new ArrayList<>();
            if(scheduleForWeek.get(task.getDay()) != null){
                scheduleForWeek.get(day).add(task.getTask());
            }else {
                tasks.add(task.getTask());
                scheduleForWeek.put(day, tasks);
            }
        }
    public void removeTask(DailyTasks task){
        {
        scheduleForWeek.remove(task.getDay(),task.getTask());
        }
    }

    }

