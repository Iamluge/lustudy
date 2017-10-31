package com.lu.solr;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;

public class SolrManager {
	@Test
	public void testAdd() throws Exception {
		String baseUrl = "http://localhost:8080/solr/";
		SolrServer solrServer = new HttpSolrServer(baseUrl);
		SolrInputDocument solrInputDocument = new SolrInputDocument();
		solrInputDocument.addField("id", "luge");
		solrInputDocument.addField("name", "laolu");
		solrServer.add(solrInputDocument);
		solrServer.commit();
	}

	@Test
	public void testDelete() throws SolrServerException, IOException {
		String baseUrl = "http://localhost:8080/solr/";
		SolrServer solrServer = new HttpSolrServer(baseUrl);
		solrServer.deleteById("luge");
		solrServer.commit();
	}

	@Test
	public void testSearch() throws SolrServerException {
		String baseUrl = "http://localhost:8080/solr/collection1/";
		SolrServer solrServer = new HttpSolrServer(baseUrl);
		SolrQuery solrQuery = new SolrQuery();
		solrQuery.set("q", "product_name:花儿");
		
		// 查询高亮
		solrQuery.setHighlight(true);
		solrQuery.addHighlightField("product_name");
		solrQuery.setHighlightSimplePre("<iampre>");
		solrQuery.setHighlightSimplePost("</iampost>");
		QueryResponse queryResponse = solrServer.query(solrQuery);
		SolrDocumentList solrDocumentList = queryResponse.getResults();
		Map<String, Map<String, List<String>>> highlighting = queryResponse.getHighlighting();
		
		
		System.out.println("the num row is :" + solrDocumentList.getNumFound());

		for (SolrDocument solrDocument : solrDocumentList) {
			System.out.println(solrDocument.get("id"));
			System.out.println(solrDocument.get("product_name"));
			Map<String, List<String>> map = highlighting.get(solrDocument.get("id"));
			List<String> list = map.get("product_name");
			System.out.println("+++++++++"+list.get(0));

		}
	}

}
