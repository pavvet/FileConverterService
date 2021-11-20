package Interface;

import java.util.List;

public interface IUniversity {
    public IFaculty getFaculty(int index);

    public IStudent getStudent(int index);

    public List<IFaculty> getFaculties();

    public String getName();

    public void AddStudent(IStudent student);

    public void AddFaculty(IFaculty faculty);
}
