package cc.xpbootcamp.technique.replace_type_code_with_subclass;

public class Manager extends Employee {
    @Override
    public int getType() {
        return MANAGER;
    }
}
