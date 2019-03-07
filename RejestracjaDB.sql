--------------------------------------------------------
--  File created - czwartek-marca-07-2019   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table HISTORIA
--------------------------------------------------------

  CREATE TABLE "REJESTRACJA"."HISTORIA" 
   (	"STEMPEL" DATE, 
	"ID" NUMBER, 
	"CZYNNOSC" VARCHAR2(200 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table UZYTKOWNICY
--------------------------------------------------------

  CREATE TABLE "REJESTRACJA"."UZYTKOWNICY" 
   (	"ID" NUMBER, 
	"IMIE" VARCHAR2(20 BYTE), 
	"NAZWISKO" VARCHAR2(40 BYTE), 
	"NAZWA_UZYTKOWNIKA" VARCHAR2(30 BYTE), 
	"HASLO" VARCHAR2(16 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  DDL for Table WIZYTY
--------------------------------------------------------

  CREATE TABLE "REJESTRACJA"."WIZYTY" 
   (	"DATA_WIZYTY" DATE, 
	"GODZINA_800" VARCHAR2(50 BYTE), 
	"GODZINA_830" VARCHAR2(50 BYTE), 
	"GODZINA_900" VARCHAR2(50 BYTE), 
	"GODZINA_930" VARCHAR2(50 BYTE), 
	"GODZINA_1000" VARCHAR2(50 BYTE), 
	"GODZINA_1030" VARCHAR2(50 BYTE), 
	"GODZINA_1100" VARCHAR2(50 BYTE), 
	"GODZINA_1130" VARCHAR2(50 BYTE), 
	"GODZINA_1200" VARCHAR2(50 BYTE), 
	"GODZINA_1230" VARCHAR2(50 BYTE), 
	"GODZINA_1300" VARCHAR2(50 BYTE), 
	"GODZINA_1330" VARCHAR2(50 BYTE), 
	"GODZINA_1400" VARCHAR2(50 BYTE), 
	"GODZINA_1430" VARCHAR2(50 BYTE), 
	"GODZINA_1500" VARCHAR2(50 BYTE), 
	"GODZINA_1530" VARCHAR2(50 BYTE), 
	"GODZINA_1600" VARCHAR2(50 BYTE), 
	"GODZINA_1630" VARCHAR2(50 BYTE), 
	"GODZINA_1700" VARCHAR2(50 BYTE), 
	"GODZINA_1730" VARCHAR2(50 BYTE), 
	"GODZINA_1800" VARCHAR2(50 BYTE), 
	"GODZINA_1830" VARCHAR2(50 BYTE), 
	"GODZINA_1900" VARCHAR2(50 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into REJESTRACJA.HISTORIA
SET DEFINE OFF;
REM INSERTING into REJESTRACJA.UZYTKOWNICY
SET DEFINE OFF;
Insert into REJESTRACJA.UZYTKOWNICY (ID,IMIE,NAZWISKO,NAZWA_UZYTKOWNIKA,HASLO) values ('1','Tester','Testowy','Przyk�ad','123');
REM INSERTING into REJESTRACJA.WIZYTY
SET DEFINE OFF;
Insert into REJESTRACJA.WIZYTY (DATA_WIZYTY,GODZINA_800,GODZINA_830,GODZINA_900,GODZINA_930,GODZINA_1000,GODZINA_1030,GODZINA_1100,GODZINA_1130,GODZINA_1200,GODZINA_1230,GODZINA_1300,GODZINA_1330,GODZINA_1400,GODZINA_1430,GODZINA_1500,GODZINA_1530,GODZINA_1600,GODZINA_1630,GODZINA_1700,GODZINA_1730,GODZINA_1800,GODZINA_1830,GODZINA_1900) values (to_date('19/04/15','RR/MM/DD'),null,null,null,null,null,null,'Zwierzchowska',null,null,null,null,null,null,null,null,'Marciniak',null,null,null,null,null,null,null);
--------------------------------------------------------
--  Constraints for Table WIZYTY
--------------------------------------------------------

  ALTER TABLE "REJESTRACJA"."WIZYTY" MODIFY ("DATA_WIZYTY" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table UZYTKOWNICY
--------------------------------------------------------

  ALTER TABLE "REJESTRACJA"."UZYTKOWNICY" ADD PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "REJESTRACJA"."UZYTKOWNICY" MODIFY ("HASLO" NOT NULL ENABLE);
  ALTER TABLE "REJESTRACJA"."UZYTKOWNICY" MODIFY ("NAZWA_UZYTKOWNIKA" NOT NULL ENABLE);
  ALTER TABLE "REJESTRACJA"."UZYTKOWNICY" MODIFY ("NAZWISKO" NOT NULL ENABLE);
  ALTER TABLE "REJESTRACJA"."UZYTKOWNICY" MODIFY ("IMIE" NOT NULL ENABLE);
  ALTER TABLE "REJESTRACJA"."UZYTKOWNICY" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table HISTORIA
--------------------------------------------------------

  ALTER TABLE "REJESTRACJA"."HISTORIA" ADD FOREIGN KEY ("ID")
	  REFERENCES "REJESTRACJA"."UZYTKOWNICY" ("ID") ENABLE;