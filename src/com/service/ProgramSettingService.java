package com.service;

import java.util.List;

import com.pojo.PRPjiData;
import com.pojo.ProData;
import com.pojo.RenjiData;
import com.pojo.Renyuandata;

public interface ProgramSettingService {
   public List<ProData> QueryPro(ProData prod);
   public void DeletePro(String proid);
   public void InsertPro(ProData prod);
   public ProData QueryByProid(String proid);
   public void UpdatePro(ProData prod);
   public void InsertPRPji(PRPjiData prpj);
   public List<Renyuandata> QueryRenByPro();
   public Renyuandata QueryRennameById(Renyuandata rena);
   public void InsertRenyuanji(RenjiData rjd);
   public void BusyRen(Renyuandata ren);
}
