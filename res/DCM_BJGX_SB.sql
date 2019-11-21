/*
 Navicat Premium Data Transfer

 Source Server         : orcl
 Source Server Type    : Oracle
 Source Server Version : 110200
 Source Host           : 127.0.0.1:1521
 Source Schema         : DMP

 Target Server Type    : Oracle
 Target Server Version : 110200
 File Encoding         : 65001

 Date: 21/11/2019 11:53:19
*/


-- ----------------------------
-- Table structure for DCM_BJGX_SB
-- ----------------------------
DROP TABLE "DMP"."DCM_BJGX_SB";
CREATE TABLE "DMP"."DCM_BJGX_SB" (
  "ID" VARCHAR2(32 BYTE) ,
  "TITLE" VARCHAR2(32 BYTE) ,
  "X" VARCHAR2(32 BYTE) ,
  "Y" VARCHAR2(32 BYTE) ,
  "TASKID" VARCHAR2(32 BYTE) ,
  "SBTIME" DATE ,
  "BZ" VARCHAR2(32 BYTE) ,
  "ADMINID" VARCHAR2(32 BYTE) ,
  "ADMINNAME" VARCHAR2(32 BYTE) ,
  "STATE" VARCHAR2(32 BYTE) ,
  "DESCRIPTION" VARCHAR2(2000 BYTE) ,
  "FIELDINTRO" VARCHAR2(2000 BYTE) 
)
TABLESPACE "DCMS"
LOGGING
NOCOMPRESS
PCTFREE 10
INITRANS 1
STORAGE (
  INITIAL 16777216 
  NEXT 1048576 
  MINEXTENTS 1
  MAXEXTENTS 2147483645
  BUFFER_POOL DEFAULT
)
PARALLEL 1
NOCACHE
DISABLE ROW MOVEMENT
;
