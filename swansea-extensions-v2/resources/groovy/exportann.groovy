for (doc in docs) {
 AnnotationSet prescriptions = doc.getAnnotations("Epilepsy").get("Prescription")
 AnnotationSet diagnosis = doc.getAnnotations("Epilepsy").get("Diagnosis")
 AnnotationSet seizures = doc.getAnnotations("Epilepsy").get("SeizureFrequency")
 AnnotationSet investigations = doc.getAnnotations("Epilepsy").get("Investigations")
 AnnotationSet clinicdate = doc.getAnnotations("Epilepsy").get("ClinicDate")
 AnnotationSet dateofbirth = doc.getAnnotations("Epilepsy").get("Date_of_Birth")
 
 println(doc.getFeatures().get("gate.SourceURL"))
 
for (date in clinicdate) {
System.out.println(
" Clinic Date " +
date.getFeatures().get("value")
)
 }
 
for (dob in dateofbirth) {
println(
" DOB " +
dob.getFeatures().get("value")
)
 }  
 
for (diag in diagnosis) {
println(
" Diagnosis " +
diag.getFeatures().get("PREF") + " " +
diag.getFeatures().get("Negation") + " " +
diag.getFeatures().get("Certainty") + " " +
diag.getFeatures().get("CUI")
)
 } 
 
for (prescription in prescriptions) {
println(
" Prescription " +
prescription.getFeatures().get("drug") + " " +
prescription.getFeatures().get("dose-val") + " " +
prescription.getFeatures().get("dose-unit") + " " +
prescription.getFeatures().get("dose-frequency") + " " +
prescription.getFeatures().get("time-unit") + " " +
prescription.getFeatures().get("CUI")
)
 }
 
for (seizure in seizures) {
println(
" Seizure " +
seizure.getFeatures().get("PREF") + " " +
seizure.getFeatures().get("since") + " " +
seizure.getFeatures().get("value") + " " +
seizure.getFeatures().get("frequency") + " " +
seizure.getFeatures().get("period") + " " +
seizure.getFeatures().get("CUI")
)
 }
 
for (invest in investigations) {
println(
" Investigation " +
invest.getFeatures().get("INVESTIGATION") + " " +
invest.getFeatures().get("OUTCOME") + " " +
invest.getFeatures().get("CUI")
)
 } 
 
println("")
println("")  
}