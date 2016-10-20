<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/layouts/taglibs.jsp"%>
	<display:merge title="系统数据">
		<display:column title="序号" style="text-align:center">
			<span id="xh${vc.ID}">${vc_rowNum}</span>
		</display:column>
		<display:column title="订单类型" style="text-align:center" expfield="DDLX">
			<c:if test="${vc.DDLX eq '1'}">正常单</c:if>
			<c:if test="${vc.DDLX eq '2'}">退废单</c:if>
			<c:if test="${vc.DDLX eq '3'}">改签单</c:if>
			<c:if test="${vc.DDLX eq '4'}">补差单</c:if>
		</display:column>
		<display:column title="外部单号" property="GYDDH" style="text-align:center"/>
		<display:column title="订单编号" property="DDBH" style="text-align:center" maxLength="20"/>
		<display:column title="PNR" property="PNRNO" style="text-align:center"/>
		<display:column title="票号" property="TKNO"  style="text-align:center" maxLength="12"/>
		<display:column title="金额" property="ZFJE" total="true" style="text-align:right;background-color:#00E000;color:#000000" format="{0,number,#0.00}"/>
	</display:merge>
	<display:column style="width:20px;" title="操作">
		<input type="button" value="调整票价" class="ext_btn ext_btn_submit" onclick="tzpj('${vc.DDLX}','${vc.PNRNO}')"/>
	</display:column>
	<display:merge title="银行账单数据">
	<c:choose>
		<c:when test="${param.wdpt eq '10100050'}">
			<%@include file="/WEB-INF/views/jpcwgl/jpysdz/dbreult/bank_xc.jsp"%>
		</c:when>
		<c:when test="${param.wdpt eq '10100010'}">
			<%@include file="/WEB-INF/views/jpcwgl/jpysdz/dbreult/bank_qnr.jsp"%>
		</c:when>
		<c:when test="${param.wdpt eq '10100011'}">
			<%@include file="/WEB-INF/views/jpcwgl/jpysdz/dbreult/bank_tb.jsp"%>
		</c:when>
		<c:when test="${param.wdpt eq '10100024'}">
			<%@include file="/WEB-INF/views/jpcwgl/jpysdz/dbreult/bank_tc.jsp"%>
		</c:when>
	</c:choose>
	</display:merge>
	<display:footer>
		<tr>
			<td colspan="6" align="right">合计：</td>
			<td align="right">${empty sumMap.ZZFJE ? '0.00' : vfn:format(sumMap.ZZFJE,'#0.00')}</td>
			<td>&nbsp;</td>
			<td align="right">${empty sumMap.ZWD_FSJE ? '0.00' : vfn:format(sumMap.ZWD_FSJE,'#0.00')}</td>
			<td colspan="15"></td>
		</tr>
	</display:footer>