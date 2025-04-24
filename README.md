# WareLink
 A system that connects storage service providers with business owners or suppliers who need warehouses or vacant  storage spaces with suitable conditions for a specific duration.
 
📦 Warehouse Platform API 👤 Developer Info

Sahar Turki Responsible for implementing endpoints related to Warehouse, Supplier, Provider, Complaint, and Admin.

✅ Endpoints Implemented by Sahar Turki

📍 WarehouseController

GET /api/v1/warehouse/most-used/{storeSize} ➤ Most used warehouses.

📍 SupplierController

GET /api/v1/supplier/get-all-complains/{id} ➤ All supplier complaints.

GET /api/v1/supplier/approved-complaints/{id} ➤ Approved complaints for supplier.

📍 SupplierComplaintController

PUT /api/v1/supplier-complaint/file-complain-on-provider/{supplierId}/{requestId} ➤ File complaint on provider.

📍 StorageProviderController

PUT /api/v1/provider/renew-licence/{id} ➤ Renew license.

GET /api/v1/provider/approved-complaints/{id} ➤ Approved provider complaints.

GET /api/v1/provider/get-all-complains/{id} ➤ All provider complaints.

📍 ReviewController (Additional)

GET /api/v1/review/get-average-provider-reviews/{providerId} ➤ Provider average rating.

📍 ProviderComplaintController

PUT /api/v1/provider-complaint/file-complain-on-supplier/{supplierId}/{requestId} ➤ Complaint on supplier.

📍 AdminController

PUT /api/v1/admin/validate-licence/{adminId}/{providerId} ➤ Validate license.

PUT /api/v1/admin/approve-supplier-complain/{adminId}/{supplierId}/{complainId} ➤ Approve supplier complaint.

PUT /api/v1/admin/approve-supplier-complain/{adminId}/{providerId}/{requestId} ➤ Alternate approval path.

PUT /api/v1/admin/approve-provider-licence-renew/{adminId}/{providerId} ➤ Approve license renewal.

