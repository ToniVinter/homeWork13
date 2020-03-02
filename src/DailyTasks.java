import java.util.*;

public class DailyTasks {
    private  Days day;
    private  String task;

    public DailyTasks(Days day, String task){
        this.day = day;
        this.task = task;
    }

    public Days getDay() {
        return day;
    }
    public String getTask(){
        return task;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DailyTasks that = (DailyTasks) o;
        return day == that.day &&
                Objects.equals(task, that.task);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, task);
    }
}
