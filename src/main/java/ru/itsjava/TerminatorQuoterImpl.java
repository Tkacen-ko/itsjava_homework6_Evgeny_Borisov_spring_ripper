package ru.itsjava;

@Profiling
public class TerminatorQuoterImpl implements Quoter {

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;
    private String massage;

    public void init() {
        System.out.println("Phase 2");
        System.out.println(repeat);
    }

    public TerminatorQuoterImpl() {
        System.out.println("Phase 1");
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    @Override
    @PostProxy
    public void sayQuote() {
        System.out.println("3 фаза!");
        for (int i = 0; i < repeat; i++) {
            System.out.println("massage = " + massage);
        }
    }

}
