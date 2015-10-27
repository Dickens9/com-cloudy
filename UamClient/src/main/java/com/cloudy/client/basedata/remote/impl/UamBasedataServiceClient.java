package com.cloudy.client.basedata.remote.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;

import com.cloudy.uam.auth.remote.UamSessionService;
import com.cloudy.uam.basedata.remote.UamBasedataService;
import com.cloudy.uam.basedata.remote.vo.Dict;

public class UamBasedataServiceClient
  implements UamBasedataService
{
  private UamBasedataService uamBasedataServiceServer;

  @Autowired
  private UamSessionService uamSessionService;

  public Dict findDictByType(String dictType)
  {
    return this.uamBasedataServiceServer.findDictByType(dictType);
  }

  public Dict findDictByTypeAndCode(String dictType, String dictCode)
  {
    return this.uamBasedataServiceServer.findDictByTypeAndCode(dictType, dictCode);
  }

  public Dict findDictById(String dictId)
  {
    return this.uamBasedataServiceServer.findDictById(dictId);
  }

  public void setUamBasedataServiceServer(UamBasedataService dictBaseDataServiceServer)
  {
    this.uamBasedataServiceServer = dictBaseDataServiceServer;
  }

  public String nextSeqVal(String seqCode, Object[] params)
  {
    return this.uamBasedataServiceServer.nextSeqVal(seqCode, params);
  }

  public String resetSeqVal(String seqCode, Object[] params)
  {
    return this.uamBasedataServiceServer.resetSeqVal(seqCode, params);
  }

  public String curSeqVal(String seqCode, Object[] params)
  {
    return this.uamBasedataServiceServer.curSeqVal(seqCode, params);
  }

  public String getDictValue(String dictType, String dictCode)
  {
    Dict dict = this.uamBasedataServiceServer.findDictByTypeAndCode(dictType, dictCode);
    if (dict == null) {
      return null;
    }
    return dict.getName();
  }

  public BigDecimal getSellingRate(String exchangCurrency)
  {
    return getSellingRate(this.uamSessionService.getSessionUser().getServiceCompanyId(), exchangCurrency);
  }

  public BigDecimal getBuyingRate(String exhcangCurrency)
  {
    return getBuyingRate(this.uamSessionService.getSessionUser().getServiceCompanyId(), exhcangCurrency);
  }

  public String getStdCurrency()
  {
    return getStdCurrency(this.uamSessionService.getSessionUser().getServiceCompanyId());
  }

  public BigDecimal getSellingRate(String companyId, String exchangCurrency)
  {
    return this.uamBasedataServiceServer.getSellingRate(companyId);
  }

  public BigDecimal getBuyingRate(String companyId, String exhcangCurrency)
  {
    return this.uamBasedataServiceServer.getBuyingRate(companyId);
  }

  public String getStdCurrency(String companyId)
  {
    return this.uamBasedataServiceServer.getStdCurrency();
  }
}