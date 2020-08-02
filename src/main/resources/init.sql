-- noinspection SqlNoDataSourceInspectionForFile

DROP TABLE IF EXISTS WORD;

CREATE TABLE WORD
(
  id      VARCHAR (19) NOT NULL COMMENT '主键ID',
  kana    VARCHAR(20) NULL DEFAULT NULL COMMENT '假名',
  kanji   VARCHAR(500) NOT NULL DEFAULT '' COMMENT '汉字',
  cn  VARCHAR(500) DEFAULT NULL COMMENT '中文',
  level   int(10) NOT NULL DEFAULT 0 COMMENT '难度',
  classification    VARCHAR (10) NOT NULL DEFAULT  '' COMMENT '分类',
  homoionym VARCHAR (100) COMMENT '近义词',
  antonym VARCHAR (100) COMMENT '反义词',
  example VARCHAR (1000) NOT NULL COMMENT '例句',
  is_mastered BOOLEAN NOT NULL DEFAULT false COMMENT '是否掌握',
  PRIMARY KEY (id)
);

INSERT INTO WORD(id, kana, kanji, cn, level, classification, homoionym, antonym, example, is_mastered) VALUES ('000001', 'ごかんせい', '互換性', '兼容性', 2, 'IT用語', '', '', '今回ソニーが公式Blog上で追記したのは、「上位100本のほぼ全て」は、中途段階ですでに非常に高い互換性が確認できているとの意味であり、実際にはすでに数百本の検証を終えていること、発売までにはさらに数千本を検証し、いずれは4000本以上存在するPS4ソフトのうち大多数は対応することになるだろう、という内容です。URL：https://japanese.engadget.com/jp-2020-03-20-5-ps4-ps5.html', false);
INSERT INTO WORD(id, kana, kanji, cn, level, classification, homoionym, antonym, example, is_mastered) VALUES ('000002', 'フラグメンテーション', 'フラグメンテーション', '磁盘碎片', 2, 'IT用語', '断片化する', 'デフラグ', 'ハードディスクの場合、使い続けると、ファイル（を構成するディスクのセクタ）が不連続な領域に分散してしまい、その結果、ファイルを読み書きする際に、ヘッドの移動量が多くなり、アクセス速度の低下の一因になる。これを解消する目的で、ファイルを連続した領域に並べ直すのが「デフラグ」である（フラグメンテーション＝断片化された状態を解消させる、という意味）。URL：https://www.atmarkit.co.jp/ait/articles/1808/27/news034.html', false);
INSERT INTO WORD(id, kana, kanji, cn, level, classification, homoionym, antonym, example, is_mastered) VALUES ('000003', 'にがおえ', '似顔絵', '肖像画', 1, '日常', '', '', '', true);