package com.training.history.serviceImpl;
import com.training.history.model.History;
import com.training.history.service.HistoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
@Service
public class HistoryServiceImpl implements HistoryService {
    @Override
    public List<History> getall() {
        List<History>getall=new ArrayList<>();
        History h1=new History(1,"amansaxena",22);
        History h2=new History(2,"divyabisht",23);
        History h3=new History(3,"kamal",25);
        getall.add(h1);
        getall.add(h2);
        getall.add(h3);
        return getall();
//        return null;
    }

    @Override
    public History addHistory(History history) {
        return history;
    }

    @Override
    public History updateHistory(History history) {
        return history;
    }

    @Override
    public String deleteHistory(int id) {
        return "deleteid:"+id;
    }
}
