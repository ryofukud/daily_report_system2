package actions.views;

import java.util.ArrayList;
import java.util.List;

import models.good;
public class GoodConverter {

    public static good toModel(GoodView gv) {
        return new good(
                gv.getId(),
                EmployeeConverter.toModel(gv.getEmployee()),
                ReportConverter.toModel(gv.getReport()));
    }

    public static GoodView toView(good g) {

        if (g == null) {
            return null;
        }

        return new GoodView(
                g.getId(),
                EmployeeConverter.toView(g.getEmployee()),
                ReportConverter.toView(g.getReport()));
    }

    public static List<GoodView> toViewList(List<good> list){
        List<GoodView> evs = new ArrayList<>();

        for (good g : list) {
            evs.add(toView(g));
        }

        return evs;
    }

    public static void copyViewToModel(good g, GoodView gv) {
        g.setId(gv.getId());
        g.setEmployee(EmployeeConverter.toModel(gv.getEmployee()));
        g.setReport(ReportConverter.toModel(gv.getReport()));
    }
}
