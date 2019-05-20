import {Asset} from './org.hyperledger.composer.system';
import {Participant} from './org.hyperledger.composer.system';
import {Transaction} from './org.hyperledger.composer.system';
import {Event} from './org.hyperledger.composer.system';
// export namespace org.lifemed.medic{
   export enum PatientCondition {
      Surgery,
      Checkup,
      Complications,
      EmergencyType,
      Ailment,
   }
   export class Report extends Asset {
      reportId: string;
      pcon: PatientCondition;
      Description: string;
      timestamp: Date;
      owner: MedicAdmin;
   }
   export class MedicAdmin extends Participant {
      mid: string;
      Name: string;
      branchcode: string;
   }
   export class SendReport extends Transaction {
      report: Report;
      newOwner: MedicAdmin;
   }
// }
