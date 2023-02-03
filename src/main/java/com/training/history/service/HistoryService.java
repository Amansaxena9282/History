package com.training.history.service;
import com.training.history.model.History;

import java.util.List;
public interface HistoryService {
    //get  for getting the data
    public  List<History>getall();
    //post  for insert tha data
    public  History addHistory(History history);
    //put method for data updation
    public  History updateHistory(History history);
    //delete
    public  String deleteHistory(int id);
}
