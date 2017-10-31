package com.lu.lucene;

import java.io.File;
import java.io.IOException;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field.Store;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;
import org.junit.Test;
import org.wltea.analyzer.lucene.IKAnalyzer;

public class LuceneManager {
	public IndexWriter getIndexWriter() throws Exception{
		// 第一步：创建一个java工程，并导入jar包。
		// 第二步：创建一个indexwriter对象。
		Directory directory=FSDirectory.open(new File("d:\\lucene\\index"));
		Analyzer analyzer=new IKAnalyzer();
		IndexWriterConfig indexWriterConfig=new IndexWriterConfig(Version.LATEST,analyzer);
		IndexWriter indexWriter=new IndexWriter(directory, indexWriterConfig);
		return indexWriter;
	}

	@Test
	public void testDelete() throws Exception {
		IndexWriter indexWriter = getIndexWriter();
		indexWriter.deleteAll();
		indexWriter.close();
	}
	@Test
	public void testDeletePart() throws Exception{
		
		IndexWriter indexWriter = getIndexWriter();
		Query query = new TermQuery(new Term("fileName","apache"));
		indexWriter.deleteDocuments(query);
		indexWriter.close();
	}
	
	//修改
		@Test
		public void testUpdate() throws Exception {
			IndexWriter indexWriter = getIndexWriter();
			Document doc = new Document();
			doc.add(new TextField("fileN", "测试文件名",Store.YES));
			doc.add(new TextField("fileC", "测试文件内容",Store.YES));
			indexWriter.updateDocument(new Term("fileName","lucene"), doc, new IKAnalyzer());
			indexWriter.close();
		}
}
