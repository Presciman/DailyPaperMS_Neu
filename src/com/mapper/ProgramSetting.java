package com.mapper;

import java.util.List;

import com.pojo.PRPjiData;
import com.pojo.ProData;
import com.pojo.RenjiData;
import com.pojo.Renyuandata;

public interface ProgramSetting {
	public List<ProData> QueryPro(ProData prod) throws Exception;
	public void DeletePro(String proid) throws Exception;
	public void InsertPro(ProData prod) throws Exception;
	public void UpdatePro(ProData prod) throws Exception;
	public ProData QueryByProid(ProData proid) throws Exception;
	public void InsertPRPji(PRPjiData prpj) throws Exception;
	public List<Renyuandata> QueryRenjiByproid () throws Exception;
	public Renyuandata QueryRennameById(Renyuandata rjd)throws Exception;
	public void InsertRenyuanji(RenjiData rjd)throws Exception;
	public void BusyRen(Renyuandata ren)throws Exception;
}
