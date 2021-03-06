package cc.xpbootcamp.technique.replace_type_code_with_state_strategy;

public class Salesman extends EmployeeType {
    @Override
    int getTypeCode() {
        return EmployeeType.SALESMAN;
    }

    @Override
    public int payAmount() {
        return monthlySalary + commission;
    }
}
