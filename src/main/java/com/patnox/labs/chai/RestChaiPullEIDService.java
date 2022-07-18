package com.patnox.labs.chai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class RestChaiPullEIDService
{
	// private final StatsRepository statsRepository;

	//   @Autowired
	//   public RestStatsService(StatsRepository statsRepository) {
	//     this.statsRepository = statsRepository;
	//   }
	  
	public returnObject getAllResults(String boost) {
        System.out.println("CHAI Processing EID PULL: " + boost);
		returnObject hob = new returnObject();
	    List<ChaiEIDResultObject> mess = new ArrayList<>();
        String[] orderIds = boost.split(",");
        for(String m : orderIds) {
            ChaiEIDResultObject ro = new ChaiEIDResultObject();
			ro.genID();
			ro.setOrder_number(m);
            mess.add(ro);
            System.out.println("Adding payload for order: " + m);
        }
		hob.setData(mess);
        return(hob);
	}

	public static class returnObject implements Serializable {
		Integer current_page = 1;
		List<ChaiEIDResultObject> data = new ArrayList<>();
		String first_page_url = "https://cdckemri-test.nascop.org/api/function?page=1";
		Integer from = 1;
		Integer last_page = 1;
		String last_page_url = "https://cdckemri-test.nascop.org/api/function?page=1";
		String next_page_url = "https://cdckemri-test.nascop.org/api/function";
		String path = "https://cdckemri-test.nascop.org/api/function";
		Integer per_page = 100;
		String prev_page_url = "https://cdckemri-test.nascop.org/api/function";
		Integer to = 1;
		Integer total = 1;

		public returnObject() {
			//
		}

		public Integer getCurrent_page() {
			return current_page;
		}
		public void setCurrent_page(Integer current_page) {
			this.current_page = current_page;
		}
		public List<ChaiEIDResultObject> getData() {
			return data;
		}
		public void setData(List<ChaiEIDResultObject> data) {
			this.data = data;
		}
		public String getFirst_page_url() {
			return first_page_url;
		}
		public void setFirst_page_url(String first_page_url) {
			this.first_page_url = first_page_url;
		}
		public Integer getFrom() {
			return from;
		}
		public void setFrom(Integer from) {
			this.from = from;
		}
		public Integer getLast_page() {
			return last_page;
		}
		public void setLast_page(Integer last_page) {
			this.last_page = last_page;
		}
		public String getLast_page_url() {
			return last_page_url;
		}
		public void setLast_page_url(String last_page_url) {
			this.last_page_url = last_page_url;
		}
		public String getNext_page_url() {
			return next_page_url;
		}
		public void setNext_page_url(String next_page_url) {
			this.next_page_url = next_page_url;
		}
		public String getPath() {
			return path;
		}
		public void setPath(String path) {
			this.path = path;
		}
		public Integer getPer_page() {
			return per_page;
		}
		public void setPer_page(Integer per_page) {
			this.per_page = per_page;
		}
		public String getPrev_page_url() {
			return prev_page_url;
		}
		public void setPrev_page_url(String prev_page_url) {
			this.prev_page_url = prev_page_url;
		}
		public Integer getTo() {
			return to;
		}
		public void setTo(Integer to) {
			this.to = to;
		}
		public Integer getTotal() {
			return total;
		}
		public void setTotal(Integer total) {
			this.total = total;
		}
	} 
}